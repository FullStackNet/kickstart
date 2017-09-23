/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */
package platform.util.security;

import java.util.Arrays;

import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;



/*
 * AES Encryption - Java implementation of aes.js which is part of cryptico.min.js - our JS encryption library
 * http://point-at-infinity.org/jsaes/jsaes.js
 */
public class AES {
	private static int[] Sbox = new int[] {99, 124, 119, 123, 242, 107, 111, 197, 48, 1, 103, 43, 254, 215, 171, 118, 202, 130, 201, 125, 250, 89, 71, 240, 173, 212, 162, 175, 156, 164, 114, 192, 183, 253, 147, 38, 54, 63, 247, 204, 52, 165, 229, 241, 113, 216, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, 226, 235, 39, 178, 117, 9, 131, 44, 26, 27, 110, 90, 160, 82, 59, 214, 179, 41, 227, 47, 132, 83, 209, 0, 237, 32, 252, 177, 91, 106, 203, 190, 57, 74, 76, 88, 207, 208, 239, 170, 251, 67, 77, 51, 133, 69, 249, 2, 127, 80, 60, 159, 168, 81, 163, 64, 143, 146, 157, 56, 245, 188, 182, 218, 33, 16, 255, 243, 210, 205, 12, 19, 236, 95, 151, 68, 23, 196, 167, 126, 61, 100, 93, 25, 115, 96, 129, 79, 220, 34, 42, 144, 136, 70, 238, 184, 20, 222, 94, 11, 219, 224, 50, 58, 10, 73, 6, 36, 92, 194, 211, 172, 98, 145, 149, 228, 121, 231, 200, 55, 109, 141, 213, 78, 169, 108, 86, 244, 234, 101, 122, 174, 8, 186, 120, 37, 46, 28, 166, 180, 198, 232, 221, 116, 31, 75, 189, 139, 138, 112, 62, 181, 102, 72, 3, 246, 14, 97, 53, 87, 185, 134, 193, 29, 158, 225, 248, 152, 17, 105, 217, 142, 148, 155, 30, 135, 233, 206, 85, 40, 223, 140, 161, 137, 13, 191, 230, 66, 104, 65, 153, 45, 15, 176, 84, 187, 22};
    private static int[] ShiftRowTab = new int[] {0, 5, 10, 15, 4, 9, 14, 3, 8, 13, 2, 7, 12, 1, 6, 11};
    private static int[] Sbox_Inv;
    private static int[] ShiftRowTab_Inv;
    private static int[] xtime;

    public static void Init() {
        Sbox_Inv = new int[256];
        for (int i = 0; i < 256; i++)
        	Sbox_Inv[Sbox[i]] = i;

        ShiftRowTab_Inv = new int[16];
        for (int i = 0; i < 16; i++)
        	ShiftRowTab_Inv[ShiftRowTab[i]] = i;

        xtime = new int[256];
        for (int i = 0; i < 128; i++) {
            xtime[i] = i << 1;
            xtime[128 + i] = (i << 1) ^ 0x1b;
        }
    }

    public static void Done() {
        Sbox_Inv = null;
        ShiftRowTab_Inv = null;
        xtime = null;
    }

    public static byte[] ExpandKey(byte[] key) throws ApplicationException {
        int kl = key.length,
            ks, Rcon = 1;
        switch (kl) {
	        case 16:
	            ks = 16 * (10 + 1);
	            break;
	        case 24:
	            ks = 16 * (12 + 1);
	            break;
	        case 32:
	            ks = 16 * (14 + 1);
	            break;
	        default:
	            throw new ApplicationException(ExceptionSeverity.ERROR, "ExpandKey: Only key lengths of 16, 24 or 32 bytes allowed!");
        }
        byte[] newKey = new byte[ks];
        for (int i = 0; i < kl; i++)
        	newKey[i] = key[i];
        for (int i = kl; i < ks; i += 4) {
        	byte[] temp = Arrays.copyOfRange(newKey, i - 4, i);
            if (i % kl == 0) {
                temp = new byte[] {(byte) (Sbox[0xFF & temp[1]] ^ Rcon), (byte) Sbox[0xFF & temp[2]], (byte) Sbox[0xFF & temp[3]], (byte) Sbox[0xFF & temp[0]]};
                if ((Rcon <<= 1) >= 256) Rcon ^= 0x11b;
            }
            else if ((kl > 24) && (i % kl == 16)) temp = new byte[] {(byte) Sbox[0xFF & temp[0]], (byte) Sbox[0xFF & temp[1]], (byte) Sbox[0xFF & temp[2]], (byte) Sbox[0xFF & temp[3]]};
            for (int j = 0; j < 4; j++)
            	newKey[i + j] = (byte) (newKey[i + j - kl] ^ temp[j]);
        }
        return newKey;
    }

    public static void Encrypt(byte[] block, byte[] key) {
        int l = key.length;
        AddRoundKey(block,  Arrays.copyOfRange(key, 0, 16));
        int i = 16;
        for (; i < l - 16; i += 16) {
            SubBytes(block, Sbox);
            ShiftRows(block, ShiftRowTab);
            MixColumns(block);
            AddRoundKey(block,  Arrays.copyOfRange(key, i, i + 16));
        }
        SubBytes(block, Sbox);
        ShiftRows(block, ShiftRowTab);
        AddRoundKey(block,  Arrays.copyOfRange(key, i, l));
    }

    public static void Decrypt(byte[] block, byte[] key) {
        int l = key.length;
        AddRoundKey(block,  Arrays.copyOfRange(key, l - 16, l));
        ShiftRows(block, ShiftRowTab_Inv);
        SubBytes(block, Sbox_Inv);
        for (int i = l - 32; i >= 16; i -= 16) {
            AddRoundKey(block, Arrays.copyOfRange(key, i, i + 16));
            MixColumns_Inv(block);
            ShiftRows(block, ShiftRowTab_Inv);
            SubBytes(block, Sbox_Inv);
        }
        AddRoundKey(block, Arrays.copyOfRange(key, 0, 16));
    }

    private static void SubBytes(byte[] state, int[] sbox) {
        for (int i = 0; i < 16; i++)
        	state[i] = (byte) sbox[0xFF & state[i]];
    }

    private static void AddRoundKey(byte[] state, byte[] rkey) {
        for (int i = 0; i < 16; i++)
        	state[i] ^= rkey[i];
    }

    private static void ShiftRows(byte[] state, int[] shifttab) {
    	byte[] h = state.clone();
        for (int i = 0; i < 16; i++)
        	state[i] = h[shifttab[i]];
    }

    private static void MixColumns(byte[] state) {
        for (int i = 0; i < 16; i += 4) {
        	byte s0 = state[i + 0],
                s1 = state[i + 1];
        	byte s2 = state[i + 2],
                s3 = state[i + 3];
        	byte h = (byte) (s0 ^ s1 ^ s2 ^ s3);
            state[i + 0] ^= h ^ xtime[0xFF & (s0 ^ s1)];
            state[i + 1] ^= h ^ xtime[0xFF & (s1 ^ s2)];
            state[i + 2] ^= h ^ xtime[0xFF & (s2 ^ s3)];
            state[i + 3] ^= h ^ xtime[0xFF & (s3 ^ s0)];
        }
    }

    private static void MixColumns_Inv(byte[] state) {
        for (int i = 0; i < 16; i += 4) {
        	byte s0 = state[i + 0],
                s1 = state[i + 1];
        	byte s2 = state[i + 2],
                s3 = state[i + 3];
        	byte h = (byte) (s0 ^ s1 ^ s2 ^ s3);
        	byte xh = (byte) (xtime[0xFF & h]);
        	byte h1 = (byte) (xtime[xtime[0xFF & (xh ^ s0 ^ s2)]] ^ h);
        	byte h2 = (byte) (xtime[xtime[0xFF & (xh ^ s1 ^ s3)]] ^ h);
            state[i + 0] ^= h1 ^ xtime[0xFF & (s0 ^ s1)];
            state[i + 1] ^= h2 ^ xtime[0xFF & (s1 ^ s2)];
            state[i + 2] ^= h1 ^ xtime[0xFF & (s2 ^ s3)];
            state[i + 3] ^= h2 ^ xtime[0xFF & (s3 ^ s0)];
        }
    }
}
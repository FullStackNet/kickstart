package platform.webservice.ui.component;

import platform.util.Util;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.BarChartDefinition;
import platform.webservice.ui.definition.BarChartObject;
import platform.webservice.ui.html.*;

import java.util.List;
/*

<div class="l-container graph-container">
	<h3 class="chart-title"><i class="fa fa-bar-chart"></i> Processor Speeds (GHz)</h3>
	<div class="l-row chart-container chart-container-column">
			<div class="l-col-1 column-y-axis">
				<ul class="chart-column-y-axis text-small">
					<li> 4.0 </li>
					<li> 3.6 </li>
				</ul>
			</div>
			<div class="l-col-11 chart-columns-contents">
					<ul class="chart-columns l-group animate-on-appear">
						<li><span style="height: 80%" class="bg-info"> 3.20 </span></li>
						<li><span style="height: 73%" class="bg-info"> 2.93 </span></li>
					</ul>
					<ul class="graph-grid l-group" style="display: none;">
						<li></li>
						<li></li>
					</ul>
			</div>
			<div class="l-col-11 l-col-offset-1 column-x-axis margin-bottom-1">
				<ul class="text-small chart-column-x-axis l-group">
					<li> i7-965 </li>
					<li> i7-940 </li>
				</ul>
			</div>
	</div>
	<h5 class="x-axis-label"> Processor Model </h5>
</div>
*/
public class BaseBarChartHtmlView extends BaseView {
	UIServletContext mContext;
	BarChartDefinition mDefinition;

	public BaseBarChartHtmlView(UIServletContext ctx) {
		super();
		mContext = ctx;
		mContext.getPageBuilder().addJS(new JS("jsapi", "https://www.google.com"));
		mDefinition = new BarChartDefinition();
	}
	public UIServletContext getContext() {
		return mContext;
	}
	
	public BarChartDefinition getDefinition() {
		return mDefinition;
	}
	
	public void buildUI(List<BarChartObject> data,String color) {
		// TODO Auto-generated method stu
		double  min = 0.0;
		double  max = 100;
		boolean zerovalue = false;
		if (!Util.isEmpty(data)) {
			for(BarChartObject object:data)
			{
				if (!zerovalue) {
					if (object.getValue() != null) {
						if ((min == 0) || (min > object.getValue()))
							min = object.getValue();
					}
				} else {
					if (object.getValue() != null) {
						if (object.getValue() == 0) {
							zerovalue = true;
							min = 0.0;
						}
					}
				}

			}
		}

		long  step = 10;

		if (min != max) {
			step = (new Double(max - min / 10)).longValue();
		}

		Div container = getView();
		container.addAttribute("class","l-container graph-container");
		H3 chart_title = new H3("<i class=\"fa fa-bar-chart\"></i>"+getDefinition().getTitle());
		chart_title.addAttribute("class","chart-title");
		container.addChild(chart_title);

		Div row = new Div(null,"l-row chart-container chart-container-column");

		Div col1_y_axis = new Div(null,"l-col-1 column-y-axis");
		UL ul = new UL(null,"chart-column-y-axis text-small");
		LI li;
		double current_value = min;
		for(int i=0; i < 10; i++) {
			current_value = current_value+(i*step);
			li  = new LI();
			li.addChild(new TEXT(""+current_value));
			ul.addChild(li);
		}
		col1_y_axis.addChild(ul);

		row.addChild(col1_y_axis);

		Div col11 = new Div(null,"l-col-11 chart-columns-contents");
		ul = new UL(null,"chart-columns l-group animate-on-appear");
		if (!Util.isEmpty(data)) {
			for (BarChartObject object : data) {
				li = new LI();
				li.addAttribute("style", "width: 8.2%");
				SPAN span = new SPAN(null, color);
				double percentage = (object.getValue()*100)/max;
				span.addAttribute("style", "height: "+percentage+"%");
				span.setText(""+object.getValue());
				li.addChild(span);
				ul.addChild(li);
			}
		}
		col11.addChild(ul);

		ul = new UL(null,"graph-grid l-group");
		ul.addAttribute("style","display:None");
		for (BarChartObject object : data) {
			li = new LI();
			ul.addChild(li);
		}
		col11.addChild(ul);
		row.addChild(col11);

		Div col1_x_axis = new Div(null,"l-col-11 l-col-offset-1 column-x-axis margin-bottom-1");
		ul = new UL(null,"text-small chart-column-x-axis l-group");
		if (!Util.isEmpty(data)) {
			for(BarChartObject object:data) {
				li = new LI(null, null);
				li.setText(object.getPoint());
				ul.addChild(li);
			}
		}

		col1_x_axis.addChild(ul);

		row.addChild(col1_x_axis);

		container.addChild(row);
		H5 x_axis_header = new H5(null,getDefinition().getX_axisTitle());
		container.addChild(x_axis_header);
	}
}

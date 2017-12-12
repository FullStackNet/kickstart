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
	double default_max = 100.0;
	public double getMax(double max) {
		double return_max =100;
		if (max == 0.0) {
			return default_max;
		}
		if (max < 10) {
			return 10;
		}
		if (max < 100) {
			return 100;
		}
		if (max < 500) {
			return 500;
		}
		if (max < 1000) {
			return 1000;
		}

		if (max < 2000) {
			return 2000;
		}
		if (max < 3000) {
			return 3000;
		}
		if (max < 5000) {
			return 5000;
		}
		if (max < 10000) {
			return 10000;
		}
		if (max < 20000) {
			return 20000;
		}
		return 50000;
	}

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
		long 	step;
		if (!Util.isEmpty(data)) {
			for(BarChartObject object:data)
			{
				if (object.getValue() != null) {
					if (object.getValue() >  max) {
						max = object.getValue();
					}
				}

			}
		}

		max = getMax(max);
		min = 0;
		step = (long)(max-min)/ 10;

		Div container = getView();
		container.addAttribute("class","l-container graph-container");
		H3 chart_title = new H3("<i class=\"fa fa-bar-chart\"></i>"+getDefinition().getTitle());
		chart_title.addAttribute("class","chart-title");
		container.addChild(chart_title);

		Div row = new Div(null,"l-row chart-container chart-container-column");

		Div col1_y_axis = new Div(null,"l-col-1 column-y-axis");
		UL ul = new UL(null,"chart-column-y-axis text-small");
		LI li;
		double current_value = 0;
		for(int i=10; i > 0; i--) {
			current_value = 0+(i*step);
			li  = new LI();
			li.addChild(new TEXT(""+current_value));
			ul.addChild(li);
		}
		double last_value = min+(10*step);
		col1_y_axis.addChild(ul);

		row.addChild(col1_y_axis);

		Div col11 = new Div(null,"l-col-11 chart-columns-contents");
		ul = new UL(null,"chart-columns l-group animate-on-appear");
		if (!Util.isEmpty(data)) {
			for (BarChartObject object : data) {
				li = new LI();
				li.addAttribute("style", "width: 8.2%");
				SPAN span = new SPAN(null, color);
				double percentage = ((object.getValue()-min)*100)/(last_value-min);
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

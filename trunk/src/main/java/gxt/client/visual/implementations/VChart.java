package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IChart;
import com.extjs.gxt.charts.client.Chart;

/**
 * @author eugenp
 */
public class VChart extends Chart implements IChart{
	
	public VChart( final String url ){
		super( url );
	}
	
	//
	@Override
	public Chart getComponent(){
		return this;
	}
	
}

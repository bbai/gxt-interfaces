package gxt.client.visual.charts.client.interfaces;

import com.extjs.gxt.charts.client.Chart;

import gxt.client.visual.charts.client.interfaces.presenter.IChartPresenter;
import gxt.client.visual.charts.client.interfaces.view.IChartView;
import gxt.client.visual.interfaces.IFlashComponent;

/**
 * @author eugenp
 */
public interface IChart extends IFlashComponent, IChartView, IChartPresenter{
	
	/** mine */
	Chart getComponent();

}

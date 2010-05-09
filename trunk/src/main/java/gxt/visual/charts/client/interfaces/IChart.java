package gxt.visual.charts.client.interfaces;

import com.extjs.gxt.charts.client.Chart;

import gxt.visual.charts.client.interfaces.presenter.IChartPresenter;
import gxt.visual.charts.client.interfaces.view.IChartView;
import gxt.visual.ui.client.interfaces.IFlashComponent;

/**
 * @author eugenp
 */
public interface IChart extends IFlashComponent, IChartView, IChartPresenter{
	
	/** mine */
	Chart getComponent();

}

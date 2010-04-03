package gxt.client.visual.interfaces;

import com.extjs.gxt.charts.client.Chart;
import gxt.client.visual.interfaces.presenter.IChartPresenter;
import gxt.client.visual.interfaces.view.IChartView;

/**
 * @author eugenp
 */
public interface IChart extends IFlashComponent, IChartView, IChartPresenter{
	
	/** mine */
	Chart getComponent();

}

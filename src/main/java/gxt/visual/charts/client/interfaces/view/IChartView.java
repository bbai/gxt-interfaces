package gxt.visual.charts.client.interfaces.view;

import gxt.visual.ui.client.interfaces.view.IFlashComponentView;

import com.extjs.gxt.charts.client.event.ChartListener;
import com.extjs.gxt.charts.client.model.ChartModel;
import com.extjs.gxt.ui.client.event.EventType;

/**
 * @author eugenp
 */
public interface IChartView extends IFlashComponentView{
	
	/**
	 * ChartClick event type.
	 */
	public static final EventType ChartClick = new EventType();
	
	/**
	 * Adds a chart listener. This listener will only receive events from the chart model and / or all chart configs that have been enabled for events.
	 * <p/>
	 * <b>Note:</b> Only adding a listener to a chart (with no listeners enabled on the chart model or chart config) will result in no chart events being fired.
	 * @param listener the listener
	 */
	void addChartListener( ChartListener listener );
	
	/**
	 * Returns the chart model.
	 * @return the chart model
	 */
	ChartModel getChartModel();
	
	/**
	 * Returns the OFC API JSON data that the chart is using.
	 * <p/>
	 * <b>Note: </b>JSON string can be either set directly via {@link #setJsonData(String)}, or constructed dynamically via {@link #setChartModel(ChartModel)}.
	 * @return the json data
	 */
	String getJsonData();
	
	/**
	 * Returns the true is the chart has loaded correctly and is ready for configuration/updates
	 * @return true if the chart has loaded
	 */
	boolean isLoaded();
	
	/**
	 * Refreshes the chart using the current model data using a delay.
	 * @param delay the delay in ms
	 */
	void delayedRefresh( int delay );
	
	/**
	 * Refreshes the chart using the current model data.
	 */
	void refresh();
	
	/**
	 * Removes the chart listener.
	 * @param listener the listener to be removed
	 */
	void removeChartListener( ChartListener listener );
	
	/**
	 * Sets the chart model.
	 * @param model the model
	 */
	void setChartModel( ChartModel model );
	
	/**
	 * Sets the chart data directly without using a chart model.
	 * @param jsonData the JSON OFC API data
	 */
	void setJsonData( String jsonData );
	
}

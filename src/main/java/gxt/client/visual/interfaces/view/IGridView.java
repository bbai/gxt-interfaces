package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.ModelProcessor;
import com.extjs.gxt.ui.client.data.ModelStringProvider;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.GridSelectionModel;
import com.extjs.gxt.ui.client.widget.grid.GridView;

/**
 * @author eugenp
 */
public interface IGridView< M extends ModelData > extends IBoxComponentView{
	
	/**
	 * Returns the auto expand column id.
	 * @return the auto expand column id
	 */
	String getAutoExpandColumn();
	
	/**
	 * Returns the auto expand maximum width.
	 * @return the max width in pixels
	 */
	int getAutoExpandMax();
	
	/**
	 * Returns the auto expand minimum width.
	 * @return the minimum width in pixels
	 */
	int getAutoExpandMin();
	
	/**
	 * Returns the column model.
	 * @return the column model
	 */
	ColumnModel getColumnModel();
	
	/**
	 * Returns the time in ms after the rows get rendered.
	 * @return the lazy row rendering time
	 */
	int getLazyRowRender();
	
	/**
	 * Returns the minimum column width.
	 * @return the min width in pixels
	 */
	int getMinColumnWidth();
	
	/**
	 * Returns the model processor.
	 * @return the model processor
	 */
	ModelProcessor< M > getModelProcessor();
	
	/**
	 * Returns the grid's selection model.
	 * @return the selection model
	 */
	GridSelectionModel< M > getSelectionModel();
	
	/**
	 * Returns the grid's store.
	 * @return the store
	 */
	ListStore< M > getStore();
	
	/**
	 * Returns the grid's view.
	 * @return the grid view
	 */
	GridView getView();
	
	/**
	 * Returns true if column resizing is enabled.
	 * @return true if resizing is enabled
	 */
	boolean isEnableColumnResize();
	
	/**
	 * Returns true if the header is hidden.
	 * @return true for hidden
	 */
	boolean isHideHeaders();
	
	/**
	 * Returns true if the load mask in enabled.
	 * @return the load mask state
	 */
	boolean isLoadMask();
	
	/**
	 * Returns true if row striping is enabled.
	 * @return the strip row state
	 */
	boolean isStripeRows();
	
	/**
	 * Returns true if rows are highlighted on mouse over.
	 * @return the track mouse state
	 */
	boolean isTrackMouseOver();
	
	/**
	 * Returns true if the view is ready.
	 * @return the view ready state
	 */
	boolean isViewReady();
	
	@SuppressWarnings( "unchecked" )
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Reconfigures the grid to use a different Store and Column Model. The View will be bound to the new objects and refreshed.
	 * @param store the new store
	 * @param cm the new column model
	 */
	void reconfigure( ListStore< M > store, ColumnModel cm );
	
	/**
	 * The id of a column in this grid that should expand to fill unused space (pre-render). This id can not be 0.
	 * @param autoExpandColumn the auto expand column id
	 */
	void setAutoExpandColumn( String autoExpandColumn );
	
	/**
	 * The maximum width the autoExpandColumn can have (if enabled) (defaults to 1000, pre-render).
	 * @param autoExpandMax the auto expand max
	 */
	void setAutoExpandMax( int autoExpandMax );
	
	/**
	 * The minimum width the autoExpandColumn can have (if enabled)(pre-render).
	 * @param autoExpandMin the auto expand min width
	 */
	void setAutoExpandMin( int autoExpandMin );
	
	/**
	 * Sets whether columns may be resized (defaults to true).
	 * @param enableColumnResize true to allow column resizing
	 */
	void setEnableColumnResize( boolean enableColumnResize );
	
	/**
	 * Sets whether the header should be hidden (defaults to false).
	 * @param hideHeaders true to hide the header
	 */
	void setHideHeaders( boolean hideHeaders );
	
	/**
	 * Sets the time in ms after the row gets rendered (defaults to 10). 0 means that the rows get rendered as soon as the grid gets rendered.
	 * @param lazyRowRender the time in ms after the rows get rendered.
	 */
	void setLazyRowRender( int lazyRowRender );
	
	/**
	 * Sets whether a load mask should be displayed during load operations (defaults to false).
	 * @param loadMask true to show a mask
	 */
	void setLoadMask( boolean loadMask );
	
	/**
	 * The minimum width a column can be resized to (defaults to 25).
	 * @param minColumnWidth the min column width
	 */
	void setMinColumnWidth( int minColumnWidth );
	
	/**
	 * Sets the grid's model processor.
	 * @see ModelProcessor
	 * @param modelProcessor
	 */
	void setModelProcessor( ModelProcessor< M > modelProcessor );
	
	/**
	 * Sets the grid selection model.
	 * @param sm the selection model
	 */
	void setSelectionModel( GridSelectionModel< M > sm );
	
	/**
	 * Sets the binder's string provider.
	 * @param stringProvider the string provider
	 */
	void setStringProvider( ModelStringProvider< M > stringProvider );
	
	/**
	 * True to stripe the rows (defaults to false).
	 * @param stripeRows true to strip rows
	 */
	void setStripeRows( boolean stripeRows );
	
	/**
	 * True to highlight rows when the mouse is over (defaults to true).
	 * @param trackMouseOver true to highlight rows on mouse over
	 */
	void setTrackMouseOver( boolean trackMouseOver );
	
	/**
	 * Sets the view's grid (pre-render).
	 * @param view the view
	 */
	void setView( GridView view );
	
}

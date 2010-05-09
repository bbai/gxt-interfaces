package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.grid.CellEditor;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.EditorGrid.ClicksToEdit;

/**
 * @author eugenp
 */
public interface IEditorGridView< M extends ModelData > extends IGridView< M >{
	
	/**
	 * Returns the active editor.
	 * @return the active editor
	 */
	CellEditor getActiveEditor();
	
	/**
	 * Returns the clicks to edit.
	 * @return the clicks to edit
	 */
	ClicksToEdit getClicksToEdit();
	
	/**
	 * Returns true if editing is active.
	 * @return the editing state
	 */
	boolean isEditing();
	
	void reconfigure( ListStore< M > store, ColumnModel cm );
	
	/**
	 * Sets the number of clicks to edit (defaults to ONE).
	 * @param clicksToEdit the clicks to edit
	 */
	void setClicksToEdit( ClicksToEdit clicksToEdit );
	
	/**
	 * Starts editing the specified for the specified row/column.
	 * @param row the row index
	 * @param col the column index
	 */
	void startEditing( final int row, final int col );
	
	/**
	 * Stops any active editing.
	 */
	void stopEditing();
	
	/**
	 * Stops any active editing.
	 * @param cancel true to cancel, false to complete
	 */
	void stopEditing( boolean cancel );
	
}

package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.Style.SortDir;
import com.extjs.gxt.ui.client.widget.grid.ColumnHeader.Head;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;

/**
 * @author eugenp
 */
public interface IColumnHeaderView extends IBoxComponentView{
	
	void enableColumnResizing();
	
	Element getElement();
	
	int getMinColumnWidth();
	
	int getSplitterWidth();
	
	int indexOf( Head head );
	
	boolean isAttached();
	
	void onBrowserEvent( Event event );
	
	void refresh();
	
	void release();
	
	void setHeader( int column, String header );
	
	void setMenu( Menu menu );
	
	void setMinColumnWidth( int minColumnWidth );
	
	void setSplitterWidth( int splitterWidth );
	
	void updateColumnHidden( int index, boolean hidden );
	
	void updateColumnWidth( int column, int width );
	
	void updateSortIcon( int colIndex, SortDir dir );
	
	void updateTotalWidth( int offset, int width );
	
}

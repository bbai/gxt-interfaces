package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.grid.CellEditor;

import gxt.visual.ui.client.interfaces.presenter.ICellEditorPresenter;
import gxt.visual.ui.client.interfaces.view.ICellEditorView;

/**
 * @author eugenp
 */
public interface ICellEditor extends IEditor, ICellEditorView, ICellEditorPresenter{
	
	/** mine */
	CellEditor getComponent();

}

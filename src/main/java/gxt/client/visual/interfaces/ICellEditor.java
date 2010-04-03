package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.grid.CellEditor;

import gxt.client.visual.interfaces.presenter.ICellEditorPresenter;
import gxt.client.visual.interfaces.view.ICellEditorView;

/**
 * @author eugenp
 */
public interface ICellEditor extends IEditor, ICellEditorView, ICellEditorPresenter{
	
	/** mine */
	CellEditor getComponent();

}

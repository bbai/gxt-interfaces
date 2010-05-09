package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.grid.CellEditor;

import gxt.visual.interfaces.presenter.ICellEditorPresenter;
import gxt.visual.interfaces.view.ICellEditorView;

/**
 * @author eugenp
 */
public interface ICellEditor extends IEditor, ICellEditorView, ICellEditorPresenter{
	
	/** mine */
	CellEditor getComponent();

}

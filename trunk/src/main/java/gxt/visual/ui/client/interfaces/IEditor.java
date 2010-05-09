package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.Editor;

import gxt.visual.ui.client.interfaces.presenter.IEditorPresenter;
import gxt.visual.ui.client.interfaces.view.IEditorView;

/**
 * @author eugenp
 */
public interface IEditor extends IBoxComponent, IEditorView, IEditorPresenter{
	
	/** mine */
	Editor getComponent();

}

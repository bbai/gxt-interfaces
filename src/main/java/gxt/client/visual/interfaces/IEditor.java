package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Editor;

import gxt.client.visual.interfaces.presenter.IEditorPresenter;
import gxt.client.visual.interfaces.view.IEditorView;

/**
 * @author eugenp
 */
public interface IEditor extends IBoxComponent, IEditorView, IEditorPresenter{
	
	/** mine */
	Editor getComponent();

}

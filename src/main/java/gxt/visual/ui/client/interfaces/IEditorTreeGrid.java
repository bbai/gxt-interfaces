package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IEditorTreeGridPresenter;
import gxt.visual.ui.client.interfaces.view.IEditorTreeGridView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.treegrid.TreeGrid;

/**
 * @author eugenp
 */
public interface IEditorTreeGrid< M extends ModelData > extends ITreeGrid< M >, IEditorTreeGridView< M >, IEditorTreeGridPresenter< M >{
	
	/** mine */
	TreeGrid< M > getComponent();

}

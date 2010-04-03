package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IEditorGridPresenter;
import gxt.client.visual.interfaces.view.IEditorGridView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.grid.EditorGrid;

/**
 * @author eugenp
 */
public interface IEditorGrid< M extends ModelData > extends IGrid< M >, IEditorGridView< M >, IEditorGridPresenter< M >{
	
	/** mine */
	EditorGrid< M > getComponent();

}

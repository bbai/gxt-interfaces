package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IGridPresenter;
import gxt.client.visual.interfaces.view.IGridView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.grid.Grid;

/**
 * @author eugenp
 */
public interface IGrid< M extends ModelData > extends IBoxComponent, IGridView< M >, IGridPresenter< M >{
	
	/** mine */
	Grid< M > getComponent();

}

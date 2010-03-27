package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.ICheckBoxListViewPresenter;
import gxt.client.visual.interfaces.view.ICheckBoxListViewView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.CheckBoxListView;

/**
 * @author eugenp
 */
public interface ICheckBoxListView< M extends ModelData > extends IListView< M >, ICheckBoxListViewView< M >, ICheckBoxListViewPresenter< M >{
	
	/** mine */
	CheckBoxListView< M > getComponent();

}

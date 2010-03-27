package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IStoreFilterFieldPresenter;
import gxt.client.visual.interfaces.view.IStoreFilterFieldView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.StoreFilterField;

/**
 * @author eugenp
 */
public interface IStoreFilterField< M extends ModelData > extends ITriggerField< M >, IStoreFilterFieldView< M >, IStoreFilterFieldPresenter< M >{
	
	/** mine */
	StoreFilterField< M > getComponent();

}
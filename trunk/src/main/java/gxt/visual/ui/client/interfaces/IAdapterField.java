package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.form.AdapterField;

import gxt.visual.ui.client.interfaces.presenter.IAdapterFieldPresenter;
import gxt.visual.ui.client.interfaces.view.IAdapterFieldView;

/**
 * @author eugenp
 */
public interface IAdapterField extends IField< Object >, IAdapterFieldView, IAdapterFieldPresenter{
	
	/** mine */
	AdapterField getComponent();

}

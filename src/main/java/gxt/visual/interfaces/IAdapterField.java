package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.AdapterField;

import gxt.visual.interfaces.presenter.IAdapterFieldPresenter;
import gxt.visual.interfaces.view.IAdapterFieldView;

/**
 * @author eugenp
 */
public interface IAdapterField extends IField< Object >, IAdapterFieldView, IAdapterFieldPresenter{
	
	/** mine */
	AdapterField getComponent();

}

package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.AdapterField;
import gxt.client.visual.interfaces.presenter.IAdapterFieldPresenter;
import gxt.client.visual.interfaces.view.IAdapterFieldView;

/**
 * @author eugenp
 */
public interface IAdapterField extends IField< Object >, IAdapterFieldView, IAdapterFieldPresenter{
	
	/** mine */
	AdapterField getComponent();

}

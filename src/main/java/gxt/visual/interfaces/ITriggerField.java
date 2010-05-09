package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.ITriggerFieldPresenter;
import gxt.visual.interfaces.view.ITriggerFieldView;

import com.extjs.gxt.ui.client.widget.form.TriggerField;

/**
 * @author eugenp
 */
public interface ITriggerField< D > extends ITextField< D >, ITriggerFieldView< D >, ITriggerFieldPresenter< D >{
	
	/** mine */
	TriggerField< D > getComponent();

}

package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.ILabelFieldPresenter;
import gxt.visual.interfaces.view.ILabelFieldView;

import com.extjs.gxt.ui.client.widget.form.LabelField;

/**
 * @author eugenp
 */
public interface ILabelField extends IField< Object >, ILabelFieldView, ILabelFieldPresenter{
	
	/** mine */
	LabelField getComponent();

}

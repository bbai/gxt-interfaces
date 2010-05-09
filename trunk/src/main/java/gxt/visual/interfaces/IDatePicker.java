package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.DatePicker;

import gxt.visual.interfaces.presenter.IDatePickerPresenter;
import gxt.visual.interfaces.view.IDatePickerView;

/**
 * @author eugenp
 */
public interface IDatePicker extends IBoxComponent, IDatePickerView, IDatePickerPresenter{
	
	/** mine */
	DatePicker getComponent();

}

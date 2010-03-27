package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.DatePicker;

import gxt.client.visual.interfaces.presenter.IDatePickerPresenter;
import gxt.client.visual.interfaces.view.IDatePickerView;

/**
 * @author eugenp
 */
public interface IDatePicker extends IBoxComponent, IDatePickerView, IDatePickerPresenter{
	
	/** mine */
	DatePicker getComponent();

}

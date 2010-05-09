package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.DatePicker;

import gxt.visual.ui.client.interfaces.presenter.IDatePickerPresenter;
import gxt.visual.ui.client.interfaces.view.IDatePickerView;

/**
 * @author eugenp
 */
public interface IDatePicker extends IBoxComponent, IDatePickerView, IDatePickerPresenter{
	
	/** mine */
	DatePicker getComponent();

}

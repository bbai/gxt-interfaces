package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IDialogPresenter;
import gxt.visual.ui.client.interfaces.view.IDialogView;

import com.extjs.gxt.ui.client.widget.Dialog;

/**
 * @author eugenp
 */
public interface IDialog extends IWindow, IDialogView, IDialogPresenter{
	
	/** mine */
	Dialog getComponent();

}

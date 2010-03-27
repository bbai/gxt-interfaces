package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IDialogPresenter;
import gxt.client.visual.interfaces.view.IDialogView;

import com.extjs.gxt.ui.client.widget.Dialog;

/**
 * @author eugenp
 */
public interface IDialog extends IWindow, IDialogView, IDialogPresenter{
	
	/** mine */
	Dialog getComponent();

}

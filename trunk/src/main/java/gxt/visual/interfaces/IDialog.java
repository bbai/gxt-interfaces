package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IDialogPresenter;
import gxt.visual.interfaces.view.IDialogView;

import com.extjs.gxt.ui.client.widget.Dialog;

/**
 * @author eugenp
 */
public interface IDialog extends IWindow, IDialogView, IDialogPresenter{
	
	/** mine */
	Dialog getComponent();

}

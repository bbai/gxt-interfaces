package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.button.ButtonBar;

import gxt.visual.ui.client.interfaces.presenter.IButtonBarPresenter;
import gxt.visual.ui.client.interfaces.view.IButtonBarView;

/**
 * @author eugenp
 */
public interface IButtonBar extends IToolBar, IButtonBarPresenter, IButtonBarView{
	
	/** mine */
	ButtonBar getComponent();

}

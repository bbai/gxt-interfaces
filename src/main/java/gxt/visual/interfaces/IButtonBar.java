package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.button.ButtonBar;

import gxt.visual.interfaces.presenter.IButtonBarPresenter;
import gxt.visual.interfaces.view.IButtonBarView;

/**
 * @author eugenp
 */
public interface IButtonBar extends IToolBar, IButtonBarPresenter, IButtonBarView{
	
	/** mine */
	ButtonBar getComponent();

}

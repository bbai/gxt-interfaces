package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.button.ButtonBar;
import gxt.client.visual.interfaces.presenter.IButtonBarPresenter;
import gxt.client.visual.interfaces.view.IButtonBarView;

/**
 * @author eugenp
 */
public interface IButtonBar extends IToolBar, IButtonBarPresenter, IButtonBarView{
	
	/** mine */
	ButtonBar getComponent();

}

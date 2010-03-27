package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Header;

import gxt.client.visual.interfaces.presenter.IHeaderPresenter;
import gxt.client.visual.interfaces.view.IHeaderView;

/**
 * @author eugenp
 */
public interface IHeader extends IComponent, IHeaderView, IHeaderPresenter{
	
	/** mine */
	Header getComponent();

}

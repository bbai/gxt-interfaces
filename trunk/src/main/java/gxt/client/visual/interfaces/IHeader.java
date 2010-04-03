package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Header;
import com.extjs.gxt.ui.client.widget.IconSupport;

import gxt.client.visual.interfaces.presenter.IHeaderPresenter;
import gxt.client.visual.interfaces.view.IHeaderView;

/**
 * @author eugenp
 */
public interface IHeader extends IComponent, IHeaderView, IHeaderPresenter, IconSupport{
	
	/** mine */
	Header getComponent();

}

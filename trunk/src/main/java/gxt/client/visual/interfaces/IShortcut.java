package gxt.client.visual.interfaces;

import com.extjs.gxt.desktop.client.Shortcut;
import gxt.client.visual.interfaces.presenter.IShortcutPresenter;
import gxt.client.visual.interfaces.view.IShortcutView;

/**
 * @author eugenp
 */
public interface IShortcut extends IComponent, IShortcutView, IShortcutPresenter{
	
	/** mine */
	Shortcut getComponent();

}

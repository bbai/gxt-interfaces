package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.desktop.client.Shortcut;
import com.extjs.gxt.ui.client.widget.IconSupport;

import gxt.visual.ui.client.interfaces.presenter.IShortcutPresenter;
import gxt.visual.ui.client.interfaces.view.IShortcutView;

/**
 * @author eugenp
 */
public interface IShortcut extends IComponent, IShortcutView, IShortcutPresenter, IconSupport{
	
	/** mine */
	Shortcut getComponent();

}

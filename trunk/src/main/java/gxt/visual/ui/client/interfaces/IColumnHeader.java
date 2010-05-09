package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.grid.ColumnHeader;

import gxt.visual.ui.client.interfaces.presenter.IColumnHeaderPresenter;
import gxt.visual.ui.client.interfaces.view.IColumnHeaderView;

/**
 * @author eugenp
 */
public interface IColumnHeader extends IBoxComponent, IColumnHeaderView, IColumnHeaderPresenter{

	/** mine */
	ColumnHeader getComponent();

}

package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.ModelIconProvider;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.widget.grid.GridView;
import com.extjs.gxt.ui.client.widget.treegrid.TreeGridView;
import com.extjs.gxt.ui.client.widget.treegrid.TreeGrid.TreeNode;
import com.extjs.gxt.ui.client.widget.treepanel.TreeStyle;
import com.google.gwt.user.client.Element;

/**
 * @author eugenp
 */
public interface ITreeGridView< M extends ModelData > extends IGridView< M >{
	
	/**
	 * Collapses all nodes.
	 */
	void collapseAll();
	
	/**
	 * Expands all nodes.
	 */
	void expandAll();
	
	/**
	 * Returns the tree node for the given target.
	 * @param target the target element
	 * @return the tree node or null if no match
	 */
	TreeNode findNode( Element target );
	
	/**
	 * Returns the model icon provider.
	 * @return the icon provider
	 */
	ModelIconProvider< M > getIconProvider();
	
	/**
	 * Returns the tree style.
	 * @return the tree style
	 */
	TreeStyle getStyle();
	
	/**
	 * Returns the tree's tree store.
	 * @return the tree store
	 */
	TreeStore< M > getTreeStore();
	
	/**
	 * Returns the tree's view.
	 * @return the view
	 */
	TreeGridView getTreeView();
	
	/**
	 * Returns true if auto expand is enabled.
	 * @return the auto expand state
	 */
	boolean isAutoExpand();
	
	/**
	 * Returns true if auto load is enabled.
	 * @return the auto load state
	 */
	boolean isAutoLoad();
	
	/**
	 * Returns true when a loader is queried for it's children each time a node is expanded. Only applies when using a loader with the tree store.
	 * @return true if caching
	 */
	boolean isCaching();
	
	/**
	 * Returns true if the model is expanded.
	 * @param model the model
	 * @return true if expanded
	 */
	boolean isExpanded( M model );
	
	/**
	 * Returns true if the model is a leaf node. The leaf state allows a tree item to specify if it has children before the children have been realized.
	 * @param model the model
	 * @return the leaf state
	 */
	boolean isLeaf( M model );
	
	/**
	 * If set to true, all non leaf nodes will be expanded automatically (defaults to false).
	 * @param autoExpand the auto expand state to set.
	 */
	void setAutoExpand( boolean autoExpand );
	
	/**
	 * Sets whether all children should automatically be loaded recursively (defaults to false). Useful when the tree must be fully populated when initially rendered.
	 * @param autoLoad true to auto load
	 */
	void setAutoLoad( boolean autoLoad );
	
	/**
	 * Sets whether the children should be cached after first being retrieved from the store (defaults to true). When <code>false</code>, a load request will be made each time a node is expanded.
	 * @param caching the caching state
	 */
	void setCaching( boolean caching );
	
	/**
	 * Sets the item's expand state.
	 * @param model the model
	 * @param expand true to expand
	 */
	void setExpanded( M model, boolean expand );
	
	/**
	 * Sets the item's expand state.
	 * @param model the model
	 * @param expand true to expand
	 * @param deep true to expand all children recursively
	 */
	@SuppressWarnings( "unchecked" )
	void setExpanded( M model, boolean expand, boolean deep );
	
	/**
	 * Sets the tree's model icon provider which provides the icon style for each model.
	 * @param iconProvider the icon provider
	 */
	void setIconProvider( ModelIconProvider< M > iconProvider );
	
	/**
	 * Sets the item's leaf state. The leaf state allows control of the expand icon before the children have been realized.
	 * @param model the model
	 * @param leaf the leaf state
	 */
	void setLeaf( M model, boolean leaf );
	
	void setView( GridView view );
	
	/**
	 * Toggles the model's expand state.
	 * @param model the model
	 */
	void toggle( M model );
	
}

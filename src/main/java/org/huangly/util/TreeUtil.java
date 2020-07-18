package org.huangly.util;

import org.huangly.common.TreeData;

import java.util.ArrayList;
import java.util.List;

public class TreeUtil {

    public static List<? extends TreeData> listToTree(List<? extends TreeData> list) {
        //用递归找子。
        List<TreeData> treeList = new ArrayList<TreeData>();
        for (TreeData tree : list) {
            if (tree.getParentPk()==null || "-1".equals(tree.getParentPk() ) || "".equals(tree.getParentPk())) {
                treeList.add(findChildren(tree, list));
            }
        }
        return treeList;

    }

    private static  TreeData findChildren(TreeData tree, List<? extends TreeData> list) {
        for (TreeData node : list) {
            if ( tree.getpk().equals(node.getParentPk())) {
                if (tree.getChildren() == null) {
                    tree.setChildren(new ArrayList<TreeData>());
                }
                tree.getChildren().add(findChildren(node, list));
            }
        }
        return tree;
    }
}

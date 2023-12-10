package questions.tree;

import java.util.ArrayList;
import java.util.List;


//https://leetcode.com/problems/same-tree/

// Her iki listenin tüm elemanlarını sırayla listeye kaydettim ve sonra karşılaştırdım. Eğer eleman null ise 101 ekledim.
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<Integer> pList= new ArrayList<>();
        pList.add(p.val);
        List<Integer> qList= new ArrayList<>();
        qList.add(q.val);

        getTreeString(p,pList);
        getTreeString(q,qList);
        System.out.println(pList);
        System.out.println(qList);
        return pList.equals(qList);
    }
    public void getTreeString(TreeNode node,List<Integer> valueList){
        if(node != null){
            valueList.add(node.val);
            if (node.left == null){
                valueList.add(101);
            }else{
                getTreeString(node.left,valueList);
            }
            if (node.right == null){
                valueList.add(101);
            }else{
                getTreeString(node.right,valueList);
            }

        }
    }
}

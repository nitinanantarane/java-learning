package com.workshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

public class NodeGraph {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(4, 7, 2, 1, 0, 5, 6, 3, 23, 53, 12, 50, 30);
        Node root = null;
        for (int i : list) {
            Node node = new Node(i, null, null);

            if (root == null) root = node;
            else {
                Node subRootNode = root;
                boolean foundNode = false;
                while (!foundNode) {
                    if (node.value > subRootNode.value) {
                        if (subRootNode.right == null) {
                            subRootNode.setRight(node);
                            foundNode = true;
                        }
                        else subRootNode = subRootNode.right;

                    } else if (node.value < subRootNode.value) {
                        if (subRootNode.left == null) {
                            subRootNode.setLeft(node);
                            foundNode = true;
                        }
                        else subRootNode = subRootNode.left;
                    }
                }
            }
        }

        System.out.println(root);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Node {
        int value;
        Node left;
        Node right;

        @Override
        public String toString() {
            return value + " [L=" + left + ", R=" + right + "]";
        }
    }
}

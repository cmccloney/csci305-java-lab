/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package march26lecture;

/**
 *
 * @author cmccl_000
 */
public class AList {
  public ANode head = null;

    /**
     *
     * @param key
     * @param value
     * @return
     */
    public Object associate(Object key, Object value) {
    ANode n = nodeLookup(key);
    Object oldValue;

    if (n != null) {
      oldValue = n.getValue();
      n.setValue(value);
    } else {
      n = new ANode(key, value, head);
      head = n;
      oldValue = null;
    }
    return oldValue;
  }

  public Object find(Object key) {
    ANode n = nodeLookup(key);
    return (n == null) ? null : n.getValue();
  }

  private ANode nodeLookup(Object key) {
    ANode n = head;
    while (n != null && !n.getKey().equals(key)) {
      n = n.getLink();
    }

    return n;
  }

  public int size() {
    ANode n = head;
    int length = 0;

    while (n != null) {
      n = n.getLink();
      length++;
    }

    return length;
  }
}


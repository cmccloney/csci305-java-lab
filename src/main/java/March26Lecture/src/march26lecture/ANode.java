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
public class ANode {
  private Object key;
  private Object value;
  private ANode link;

  public ANode(Object k, Object v, ANode li) {
    key = k;
    value = v;
    link = li;
  }

  public Object getKey() {
    return key;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object v) {
    value = v;
  }

  public ANode getLink() {
    return link;
  }
}

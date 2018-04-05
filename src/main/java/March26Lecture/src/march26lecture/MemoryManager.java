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
public class MemoryManager {
    static private final int NULL = -1;
    private int[] memory;
    private int top;
    private int freeStart;
    
    public MemoryManager(int[] initialMemory){
        memory = initialMemory;
        memory[0] = memory.length;
        top = memory.length;
        //memory[1] = null;
        freeStart = 0;
    }
    
    public int push(int requestSize){
        int oldtop = top;
        top -= (requestSize + 1); // extra word for oldtop
        if (freeStart >= top || top < 0)
          throw new StackOverflowError();
        memory[top] = oldtop;
        return top + 1;
    }
    
    public void pop(){
        top = memory[top];
    }
    
    public int allocate(int requestSize){
        int size = requestSize + 1; // size including header

        // Do first-fit approach: linear search of the free
        // list for the first block of sufficient size

        int p = freeStart; // head of free list
        int lag = NULL;
        if (p >= top){
            throw new StackOverflowError();
        }
        while (p != NULL && memory[p] < size) {
          lag = p; // lag is previous p
          p = memory[p + 1]; // link to next block
        }
        if (p == NULL) // no block large enough
          throw new OutOfMemoryError();
        int nextFree = memory[p + 1]; // block after p

        // Now p is the index of a block of sufficient size
        // lag is the index of p's predecessor in the
        // free list, or NULL, and nextFree is the index of
        // p's successor in the free list, or NULL.
        // If the block has more space than we need, carve
        // out what we need from the front and return the
        // unused end part to the free list.

        int unused = memory[p]-size; // extra space in blcok
        if (unused > 1) { // if more than a header's worth
          nextFree = p + size; // index of the unused piece
          memory[nextFree] = unused; // fill in size
          memory[nextFree + 1] = memory[p + 1]; // fill in link
          memory[p] = size; // reduce p's size accordingly
        }

        // Link out the block we are allocating and done.

        if (lag == NULL) freeStart = nextFree;
        else memory[lag + 1] = nextFree;
        return p + 1; // index of useable word (after header)
    }
    
    public void deallocate(int address){
        int addr = address - 1; // real start of the block

        // Find the insertion point in the sorted free list
        // for this block

        int p = freeStart;
        int lag = NULL;
        while (p != NULL && p < addr) {
          lag = p;
          p = memory[p + 1];
        }

        // Now p is the index of the block to come after
        // ours in the free list, or NULL, and lag is the
        // index of the block to come before ours in the
        // free list, or NULL.

        // If the one to come after ours is adjacent to it,
        // merge it into ours and restore the property
        // described above.

        if (addr + memory[addr] == p) {
          memory[addr] += memory[p]; // add its size to ours
          p = memory[p + 1];
        }

        if (lag == NULL) { // ours will be first free
          freeStart = addr;
          memory[addr + 1] = p;
        }
        else if (lag + memory[lag] == addr) { // block before is adjacent to ours
          memory[lag] += memory[addr]; // merge ours into it
          memory[lag + 1] = p;
        }
        else { // neither, just a simple insertion
          memory[lag + 1] = addr;
          memory[addr + 1] = p;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

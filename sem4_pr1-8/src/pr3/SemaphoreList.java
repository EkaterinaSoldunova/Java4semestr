package pr3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class SemaphoreList<E> implements List<E> {
    private static final Semaphore semaphore = new Semaphore(1);
    private volatile List<E> list = new ArrayList<>();

    @Override
    public int size() {
        int size = 0;
        try {
            semaphore.acquire();
            size = list.size();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = false;
        try {
            semaphore.acquire();
            empty = list.isEmpty();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return empty;
    }

    @Override
    public boolean contains(Object o) {
        boolean x = false;
        try {
            semaphore.acquire();
            x = list.contains(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> x = null;
        try {
            semaphore.acquire();
            x = list.iterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public Object[] toArray() {
        Object[] x = new Object[0];
        try {
            semaphore.acquire();
            x = list.toArray();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        T[] x = null;
        try {
            semaphore.acquire();
            x = list.toArray(a);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public boolean add(E e) {
        boolean x = false;
        try {
            semaphore.acquire();
            x = list.add(e);
            semaphore.release();
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        return x;
    }

    @Override
    public boolean remove(Object o) {
        boolean x = false;
        try {
            semaphore.acquire();
            x = list.remove(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean x = false;
        try {
            semaphore.acquire();
            x = list.containsAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean x = false;
        try {
            semaphore.acquire();
            x = list.addAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        boolean x = false;
        try {
            semaphore.acquire();
            x = list.addAll(index,c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean x = false;
        try {
            semaphore.acquire();
            x = list.removeAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean x = false;
        try {
            semaphore.acquire();
            x = list.retainAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            list.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        E x = null;
        try {
            semaphore.acquire();
            x = list.get(index);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public E set(int index, E element) {
        E x = null;
        try {
            semaphore.acquire();
            x = list.set(index, element);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public void add(int index, E element) {
        try {
            semaphore.acquire();
            list.add(index, element);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E remove(int index) {
        E x = null;
        try {
            semaphore.acquire();
            x = list.remove(index);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public int indexOf(Object o) {
        int size = 0;
        try {
            semaphore.acquire();
            size = list.indexOf(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return size;
    }

    @Override
    public int lastIndexOf(Object o) {
        int size = 0;
        try {
            semaphore.acquire();
            size = list.lastIndexOf(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return size;
    }

    @Override
    public ListIterator<E> listIterator() {
        ListIterator<E> x = null;
        try {
            semaphore.acquire();
            x = list.listIterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        ListIterator<E> x = null;
        try {
            semaphore.acquire();
            x = list.listIterator(index);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        List<E> x = null;
        try {
            semaphore.acquire();
            x = list.subList(fromIndex, toIndex);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }
}

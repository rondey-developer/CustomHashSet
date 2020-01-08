package com.customCollection.CustomHashSet;

public class NewHashSet<Type> implements SetBucket<Type> {
	private CustomArrayList bucketArray = new CustomArrayList(7);
	private BucketArray<Type> BucketArray = new BucketArray<Type>();
	private BucketArray<Type> BucketArray1 = new BucketArray<Type>();
	private BucketArray<Type> BucketArray2 = new BucketArray<Type>();
	private BucketArray<Type> BucketArray3 = new BucketArray<Type>();
	private BucketArray<Type> BucketArray4 = new BucketArray<Type>();
	private BucketArray<Type> BucketArray5 = new BucketArray<Type>();
	private BucketArray<Type> BucketArray6 = new BucketArray<Type>();
	
	private void initalization() {
		bucketArray.add(BucketArray);
		bucketArray.add(BucketArray1);
		bucketArray.add(BucketArray2);
		bucketArray.add(BucketArray3);
		bucketArray.add(BucketArray4);
		bucketArray.add(BucketArray5);
		bucketArray.add(BucketArray6);
	}

	public NewHashSet() {
		initalization();
	}
	
	public void add(Type T) {
		switch (T.hashCode() % 7) {
		case 0:
			BucketArray.add(T);
			break;
		case 1:
			BucketArray1.add(T);
			break;
		case 2:
			BucketArray2.add(T);
			break;
		case 3:
			BucketArray3.add(T);
			break;
		case 4:
			BucketArray4.add(T);
			break;
		case 5:
			BucketArray5.add(T);
			break;
		case 6:
			BucketArray6.add(T);
			break;
		default:
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void remove(Type T) {
		switch (T.hashCode() % 7) {
		case 0:
			BucketArray.remove(T);
			break;
		case 1:
			BucketArray1.remove(T);
			break;
		case 2:
			BucketArray2.remove(T);
			break;
		case 3:
			BucketArray3.remove(T);
			break;
		case 4:
			BucketArray4.remove(T);
			break;
		case 5:
			BucketArray5.remove(T);
			break;
		case 6:
			BucketArray6.remove(T);
			break;
		default:
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public int size() {
		return BucketArray.size() + BucketArray1.size() + BucketArray2.size() + BucketArray3.size() + BucketArray4.size()
				+ BucketArray5.size() + BucketArray6.size();
	}

	public boolean isEmpty() {
		if (this.size() == 0)
			return true;
		else
			return false;
	}

	public boolean contains(Object e) {
		switch (e.hashCode() % 7) {
		case 0:
			return BucketArray.contains(e);
		case 1:
			return BucketArray1.contains(e);
		case 2:
			return BucketArray2.contains(e);
		case 3:
			return BucketArray3.contains(e);
		case 4:
			return BucketArray4.contains(e);
		case 5:
			return BucketArray5.contains(e);
		case 6:
			return BucketArray6.contains(e);
		default:
			return false;
		}
	}

	@Override
	public String toString() {
		String printOut = BucketArray.toString() + BucketArray1.toString() + BucketArray2.toString() + BucketArray3.toString()
				+ BucketArray4.toString() + BucketArray5.toString() + BucketArray6.toString();
		return "[ " + printOut + " ]";
	}
}

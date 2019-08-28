package iterator;
/**
 * 迭代器模式
 *
 * 解决容器封装的不好，一个使用Array,一个使用List遍历时需要单独遍历
 * 使用迭代器可以让它们各自实现iterator接口，实现hasNext和next方法
 * 同时这样做的好处，不用暴露内部自己的实现
 */

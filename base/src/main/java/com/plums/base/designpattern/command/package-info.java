/**
 * 命令模式
 *
 *         将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
 *
 *         A -> B
 *           -> C
 *
 *         A操作B、C，那么A会强耦合与BC。如果我们增加了EDF，我们需要修改A的代码
 *         命令模式将“请求封装了对象”
 *
 *          A -> commandB -> B
 *               commandC -> C
 *          command中保有一个A（操作者） command有一个操作的行为 我们动态的传入操作者 执行对应的的被操作者的行为
 *          当我们扩展了EDF后 不需要更改A的代码，我们只需要扩展CommandEDF就好了
 *
 */
package com.plums.base.designpattern.command;
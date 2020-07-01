	.data
	
base:	.asciiz "Base: "
exp:	.asciiz "Expoente: "
res:	.asciiz "O resultado de "
elev:	.asciiz "^"
igual:	.asciiz " é: "

	.text
	.globl main
	
main:
	la $a0, base
	li $v0,4
	syscall
	
	li $v0,5
	syscall
	move $t0,$v0
	
	la $a0, exp
	li $v0,4
	syscall
	
	li $v0,5
	syscall
	move $t1,$v0
	
	subi $sp, $sp, 8
	sw  $t0, 0($sp)
	sw  $t1, 4($sp)
	
	
	lw $a1, 0($sp)
	lw $a2, 4($sp)
	
	addi $t1,$zero,1
	addi $t0,$zero,0

	jal potencia
	
	move $s0,$v0
	
	
	lw $t0,0($sp)
	lw $t1, 4($sp)
	
	la $a0,res
	li $v0,4
	syscall
	
	move $a0, $t0
	li $v0,1
	syscall
	
	la $a0,elev
	li $v0,4
	syscall
	
	move $a0, $t1
	li $v0,1
	syscall
	
	la $a0,igual
	li $v0,4
	syscall
	
	move $a0, $s0
	li $v0,1
	syscall
	
	li $v0, 10
	syscall
	
potencia:
	beq $t0,$a2,fim
	subi $a2,$a2,1
	mul $t1, $t1,$a1
	j potencia
	
fim:	move $v0, $t1
	jr $ra	
	
	
	
	
	

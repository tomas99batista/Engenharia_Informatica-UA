	.data

array:	.space 24
insert:	.asciiz "Insira 1 valor: "
split:	.asciiz "-"
	.text
	.globl main

main:	
	la $s0, array
	li $t0,0
	
fill:	beq $t0,6,print
	sll $t1, $t0,2
	add $t1,$t1, $s0
	
	la $a0, insert
	li $v0, 4
	syscall
	
	li $v0, 5
	syscall
	
	sw $v0, 0($t1)
	addi $t0, $t0,1
	
	j fill
	
print:	lw $t0, 0($s0)
	li $t1,0
	la $a0, split
	li $v0, 4
	syscall
	
for:	beq $t1, 6, end
	
	la $a0, 0($t0)
	li $v0, 1
	syscall
	
	la $a0, split
	li $v0, 4
	syscall
	
	
	addi $s0, $s0,4
	lw $t0, 0($s0)
	addi $t1, $t1,1
	j for
end:
	li $v0, 10
	syscall
	
		

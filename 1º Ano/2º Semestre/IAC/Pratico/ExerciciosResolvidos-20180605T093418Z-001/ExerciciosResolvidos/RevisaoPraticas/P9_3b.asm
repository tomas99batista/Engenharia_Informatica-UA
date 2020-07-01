	.data
	
array:	.space 24
insert:	.asciiz "Insira 1 valor: "	
split:	.asciiz " - "	
desordenado:	.asciiz "\nArray Desordenado : "
ordenado:	.asciiz "Array Ordenado : "
	.text
	.globl main
	
main:
	li $t0,0
	la $s0,array
	
	
fill:	beq $t0,6,efill # Preenchimento do array
	
	la $a0, insert
	li $v0, 4
	syscall
	
	li $v0, 5
	syscall
	
	sll $t1, $t0,2
	add $t2, $t1,$s0
	sw $v0,0($t2)
	
	addi $t0,$t0,1
	j fill

efill:	subu $sp, $sp, 24
	sw $s0, 0($sp)
	
	move $a0, $s0
	li $t9, 100 #apenas para poder executar o beqz
	jal organize
	
	move $a1, $v0
	
	la $a0, ordenado
	li $v0, 4
	syscall
	
	move $a0,$a1
	jal print
	
	la $a0, desordenado
	li $v0, 4
	syscall
	
	lw $a0, 0($sp)
	jal print
	addu $sp, $sp, 24
	
	
	
organize: 
	beqz $t9, eorganize
	li $t9,0
	li $t0,0 # $t0 = i
	

for:	
	beq $t0,5, organize
	
	sll $t1, $t0,2
	add $t2, $t1,$a0
	lw $t3, 0($t2) # a[i]
	lw $t4, 4($t2) # a[i+1]
	
	addi $t0, $t0,1
	
	sgt $t5, $t3,$t4
	
	add $t9,$t9,$t5
	
	beqz $t5, for
	
	
		
	sw $t4, 0($t2) #inverte as posições
	sw $t3, 4($t2)
	j for

eorganize: 
	move $v0, $a0
	jr $ra
	
	
	
print:	
	li $t0,0
	move $a1, $a0
for2:	
	beq $t0,6,eprint
	
	sll $t1, $t0,2
	add $t2, $a1, $t1
	
	lw $a0, 0($t2)
	li $v0, 1
	syscall
	
	beq $t0,5,next
	la $a0, split
	li $v0,4
	syscall
	
next:	addi $t0, $t0,1
	j for2
	
eprint:	jr $ra	








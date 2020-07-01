	.data	
minus: .asciiz "o que conasdasdasdasdasdasdappzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzp"
maiusc: .space  20

	.text
	.globl main
main:	
	la	$a1,minus
	la	$a2,maiusc
	li	$t0,0	#i=0
	
	while:
		#While Condition (minus[i]!= '/0')
		add	$t1, $a1, $t0 #Get minus[i]
		lb 	$t2, 0($t1) #Load byte $t1 on $t2 (This is what gets us the actual letter at minus[i])
		beqz	$t2,end
		
		add	$t3, $a2, $t0 #Get maiusc[i]
		bne	$t2, ' ',notSpace #We dont want to capitalize spaces :) .

		sb 	$t2, 0($t3) #But we still want to have the space in the capitalized string, lel
				    #So what we do is store $t3 into $t2 (whait what?)
		j	increment
	notSpace:
		addi 	$t4,$t2,-32 #Capitalize letter (t4 now stores the capitalized letter of minus[i], which was stored at t2)
		sb 	$t4, 0($t3) #Store t3 into address t4 (This gives us the same letter as minus[i]
		#This then automatically jumps to increment, without needing the 'j' pseudoinstruction
	increment:
		addi	$t0,$t0,1 # i++
		j	while
	end:
		li	$v0,4
		move	$a0,$a2
		syscall
		
